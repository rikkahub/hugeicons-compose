package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AudioWave02: ImageVector
    get() {
        if (_audioWave02 != null) {
            return _audioWave02!!
        }
        _audioWave02 = ImageVector.Builder(
            name = "AudioWave02",
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
        moveTo(3f, 14f)
        verticalLineTo(9.5f)
        curveTo(3f, 8.67157f, 3.67157f, 8f, 4.5f, 8f)
        curveTo(5.32843f, 8f, 6f, 8.67157f, 6f, 9.5f)
        verticalLineTo(16.5f)
        curveTo(6f, 17.3284f, 6.67157f, 18f, 7.5f, 18f)
        curveTo(8.32843f, 18f, 9f, 17.3284f, 9f, 16.5f)
        verticalLineTo(4.5f)
        curveTo(9f, 3.67157f, 9.67157f, 3f, 10.5f, 3f)
        curveTo(11.3284f, 3f, 12f, 3.67157f, 12f, 4.5f)
        verticalLineTo(19.5f)
        curveTo(12f, 20.3284f, 12.6716f, 21f, 13.5f, 21f)
        curveTo(14.3284f, 21f, 15f, 20.3284f, 15f, 19.5f)
        verticalLineTo(8.5f)
        curveTo(15f, 7.67157f, 15.6716f, 7f, 16.5f, 7f)
        curveTo(17.3284f, 7f, 18f, 7.67157f, 18f, 8.5f)
        verticalLineTo(15.5f)
        curveTo(18f, 16.3284f, 18.6716f, 17f, 19.5f, 17f)
        curveTo(20.3284f, 17f, 21f, 16.3284f, 21f, 15.5f)
        verticalLineTo(12f)
        }
        }.build()

        return _audioWave02!!
    }

private var _audioWave02: ImageVector? = null
