package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chip: ImageVector
    get() {
        if (_chip != null) {
            return _chip!!
        }
        _chip = ImageVector.Builder(
            name = "Chip",
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
        moveTo(4f, 12f)
        curveTo(4f, 8.22876f, 4f, 6.34315f, 5.17157f, 5.17157f)
        curveTo(6.34315f, 4f, 8.22876f, 4f, 12f, 4f)
        curveTo(15.7712f, 4f, 17.6569f, 4f, 18.8284f, 5.17157f)
        curveTo(20f, 6.34315f, 20f, 8.22876f, 20f, 12f)
        curveTo(20f, 15.7712f, 20f, 17.6569f, 18.8284f, 18.8284f)
        curveTo(17.6569f, 20f, 15.7712f, 20f, 12f, 20f)
        curveTo(8.22876f, 20f, 6.34315f, 20f, 5.17157f, 18.8284f)
        curveTo(4f, 17.6569f, 4f, 15.7712f, 4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.73223f, 16.2678f)
        curveTo(8.46447f, 17f, 9.64298f, 17f, 12f, 17f)
        curveTo(12.7898f, 17f, 13.4473f, 17f, 14f, 16.9724f)
        lineTo(16.9724f, 14f)
        curveTo(17f, 13.4473f, 17f, 12.7898f, 17f, 12f)
        curveTo(17f, 9.64298f, 17f, 8.46447f, 16.2678f, 7.73223f)
        curveTo(15.5355f, 7f, 14.357f, 7f, 12f, 7f)
        curveTo(9.64298f, 7f, 8.46447f, 7f, 7.73223f, 7.73223f)
        curveTo(7f, 8.46447f, 7f, 9.64298f, 7f, 12f)
        curveTo(7f, 14.357f, 7f, 15.5355f, 7.73223f, 16.2678f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        verticalLineTo(4f)
        moveTo(16f, 2f)
        verticalLineTo(4f)
        moveTo(12f, 2f)
        verticalLineTo(4f)
        moveTo(8f, 20f)
        verticalLineTo(22f)
        moveTo(12f, 20f)
        verticalLineTo(22f)
        moveTo(16f, 20f)
        verticalLineTo(22f)
        moveTo(22f, 16f)
        horizontalLineTo(20f)
        moveTo(4f, 8f)
        horizontalLineTo(2f)
        moveTo(4f, 16f)
        horizontalLineTo(2f)
        moveTo(4f, 12f)
        horizontalLineTo(2f)
        moveTo(22f, 8f)
        horizontalLineTo(20f)
        moveTo(22f, 12f)
        horizontalLineTo(20f)
        }
        }.build()

        return _chip!!
    }

private var _chip: ImageVector? = null
