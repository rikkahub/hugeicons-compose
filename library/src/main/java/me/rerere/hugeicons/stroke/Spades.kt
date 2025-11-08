package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spades: ImageVector
    get() {
        if (_spades != null) {
            return _spades!!
        }
        _spades = ImageVector.Builder(
            name = "Spades",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.3747f, 21.3991f)
        curveTo(15.5506f, 21.1194f, 15.3236f, 20.6714f, 14.8696f, 19.7753f)
        curveTo(14.6285f, 19.2994f, 13.2915f, 16.8919f, 13.7551f, 16.4097f)
        curveTo(13.8763f, 16.2836f, 14.304f, 16.3909f, 15.1593f, 16.6054f)
        curveTo(16.4152f, 16.9205f, 18.0294f, 16.8096f, 19.4282f, 15.7714f)
        curveTo(24.7293f, 11.8367f, 15.1828f, 2f, 12f, 2f)
        curveTo(8.81719f, 2f, -0.729335f, 11.8367f, 4.57182f, 15.7714f)
        curveTo(5.97058f, 16.8096f, 7.58483f, 16.9205f, 8.84066f, 16.6054f)
        curveTo(9.696f, 16.3909f, 10.1237f, 16.2836f, 10.2449f, 16.4097f)
        curveTo(10.7085f, 16.8919f, 9.37152f, 19.2994f, 9.13041f, 19.7753f)
        curveTo(8.67639f, 20.6714f, 8.44938f, 21.1194f, 8.6253f, 21.3991f)
        curveTo(9.04019f, 22.0588f, 14.789f, 22.3304f, 15.3747f, 21.3991f)
        }
        }.build()

        return _spades!!
    }

private var _spades: ImageVector? = null
