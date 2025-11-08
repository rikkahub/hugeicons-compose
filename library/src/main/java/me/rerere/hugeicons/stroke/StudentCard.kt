package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StudentCard: ImageVector
    get() {
        if (_studentCard != null) {
            return _studentCard!!
        }
        _studentCard = ImageVector.Builder(
            name = "StudentCard",
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
        moveTo(14f, 3.5f)
        curveTo(17.7712f, 3.5f, 19.6569f, 3.5f, 20.8284f, 4.7448f)
        curveTo(22f, 5.98959f, 22f, 7.99306f, 22f, 12f)
        curveTo(22f, 16.0069f, 22f, 18.0104f, 20.8284f, 19.2552f)
        curveTo(19.6569f, 20.5f, 17.7712f, 20.5f, 14f, 20.5f)
        lineTo(10f, 20.5f)
        curveTo(6.22876f, 20.5f, 4.34315f, 20.5f, 3.17157f, 19.2552f)
        curveTo(2f, 18.0104f, 2f, 16.0069f, 2f, 12f)
        curveTo(2f, 7.99306f, 2f, 5.98959f, 3.17157f, 4.7448f)
        curveTo(4.34315f, 3.5f, 6.22876f, 3.5f, 10f, 3.5f)
        lineTo(14f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15.5f)
        curveTo(6.60865f, 13.3626f, 10.3539f, 13.246f, 12f, 15.5f)
        moveTo(10.249f, 10.2501f)
        curveTo(10.249f, 11.2166f, 9.46552f, 12.0001f, 8.49902f, 12.0001f)
        curveTo(7.53253f, 12.0001f, 6.74902f, 11.2166f, 6.74902f, 10.2501f)
        curveTo(6.74902f, 9.28362f, 7.53253f, 8.50012f, 8.49902f, 8.50012f)
        curveTo(9.46552f, 8.50012f, 10.249f, 9.28362f, 10.249f, 10.2501f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        lineTo(19f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13.5f)
        horizontalLineTo(17f)
        }
        }.build()

        return _studentCard!!
    }

private var _studentCard: ImageVector? = null
