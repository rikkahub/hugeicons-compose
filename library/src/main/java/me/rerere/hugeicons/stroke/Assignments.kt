package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Assignments: ImageVector
    get() {
        if (_assignments != null) {
            return _assignments!!
        }
        _assignments = ImageVector.Builder(
            name = "Assignments",
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
        moveTo(4f, 3f)
        horizontalLineTo(3f)
        curveTo(2.44772f, 3f, 2f, 3.44772f, 2f, 4f)
        verticalLineTo(18f)
        lineTo(3.5f, 21f)
        lineTo(5f, 18f)
        verticalLineTo(4f)
        curveTo(5f, 3.44772f, 4.55228f, 3f, 4f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.0013f)
        verticalLineTo(8.00072f)
        curveTo(21f, 5.64336f, 21f, 4.46468f, 20.2678f, 3.73234f)
        curveTo(19.5355f, 3f, 18.357f, 3f, 16f, 3f)
        horizontalLineTo(13f)
        curveTo(10.643f, 3f, 9.46447f, 3f, 8.73223f, 3.73234f)
        curveTo(8f, 4.46468f, 8f, 5.64336f, 8f, 8.00072f)
        verticalLineTo(16.0019f)
        curveTo(8f, 18.3592f, 8f, 19.5379f, 8.73223f, 20.2703f)
        curveTo(9.35264f, 20.8908f, 10.2934f, 20.9855f, 12f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 19f)
        curveTo(14f, 19f, 15.5f, 19.5f, 16.5f, 21f)
        curveTo(16.5f, 21f, 18f, 17f, 22f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(5f)
        }
        }.build()

        return _assignments!!
    }

private var _assignments: ImageVector? = null
