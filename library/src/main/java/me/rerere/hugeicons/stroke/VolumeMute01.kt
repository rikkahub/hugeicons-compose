package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VolumeMute01: ImageVector
    get() {
        if (_volumeMute01 != null) {
            return _volumeMute01!!
        }
        _volumeMute01 = ImageVector.Builder(
            name = "VolumeMute01",
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
        moveTo(18f, 14.8135f)
        verticalLineTo(9.18646f)
        curveTo(18f, 6.04126f, 18f, 4.46866f, 17.074f, 4.0773f)
        curveTo(16.1481f, 3.68593f, 15.0583f, 4.79793f, 12.8787f, 7.02192f)
        curveTo(11.7499f, 8.17365f, 11.1059f, 8.42869f, 9.5f, 8.42869f)
        curveTo(8.3879f, 8.42869f, 7.02749f, 8.28131f, 6.33706f, 9.33566f)
        curveTo(6f, 9.85038f, 6f, 10.5669f, 6f, 12f)
        curveTo(6f, 13.4331f, 6f, 14.1496f, 6.33706f, 14.6643f)
        curveTo(7.02749f, 15.7187f, 8.3879f, 15.5713f, 9.5f, 15.5713f)
        curveTo(11.106f, 15.5713f, 11.7499f, 15.8264f, 12.8787f, 16.9781f)
        curveTo(15.0583f, 19.2021f, 16.1481f, 20.3141f, 17.074f, 19.9227f)
        curveTo(18f, 19.5313f, 18f, 17.9587f, 18f, 14.8135f)
        }
        }.build()

        return _volumeMute01!!
    }

private var _volumeMute01: ImageVector? = null
