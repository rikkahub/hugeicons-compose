package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = ImageVector.Builder(
            name = "Volume",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
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
            close()
        }
        }.build()

        return _volume!!
    }

private var _volume: ImageVector? = null
