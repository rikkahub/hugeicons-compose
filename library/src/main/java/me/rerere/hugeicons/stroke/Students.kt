package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Students: ImageVector
    get() {
        if (_students != null) {
            return _students!!
        }
        _students = ImageVector.Builder(
            name = "Students",
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
        moveTo(2.5f, 6f)
        lineTo(8f, 4f)
        lineTo(13.5f, 6f)
        lineTo(11f, 7.5f)
        verticalLineTo(9f)
        curveTo(11f, 9f, 10.3333f, 8.5f, 8f, 8.5f)
        curveTo(5.66667f, 8.5f, 5f, 9f, 5f, 9f)
        verticalLineTo(7.5f)
        lineTo(2.5f, 6f)
        moveTo(2.5f, 6f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8.5f)
        verticalLineTo(9.38889f)
        curveTo(11f, 11.1071f, 9.65685f, 12.5f, 8f, 12.5f)
        curveTo(6.34315f, 12.5f, 5f, 11.1071f, 5f, 9.38889f)
        verticalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.3182f, 11.0294f)
        curveTo(15.3182f, 11.0294f, 15.803f, 10.6765f, 17.5f, 10.6765f)
        curveTo(19.197f, 10.6765f, 19.6818f, 11.0294f, 19.6818f, 11.0294f)
        moveTo(15.3182f, 11.0294f)
        verticalLineTo(10f)
        lineTo(13.5f, 9f)
        lineTo(17.5f, 7.5f)
        lineTo(21.5f, 9f)
        lineTo(19.6818f, 10f)
        verticalLineTo(11.0294f)
        moveTo(15.3182f, 11.0294f)
        verticalLineTo(11.3182f)
        curveTo(15.3182f, 12.5232f, 16.295f, 13.5f, 17.5f, 13.5f)
        curveTo(18.705f, 13.5f, 19.6818f, 12.5232f, 19.6818f, 11.3182f)
        verticalLineTo(11.0294f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.38505f, 15.926f)
        curveTo(3.44187f, 16.4525f, 0.96891f, 17.5276f, 2.47511f, 18.8729f)
        curveTo(3.21087f, 19.53f, 4.03033f, 20f, 5.06058f, 20f)
        horizontalLineTo(10.9394f)
        curveTo(11.9697f, 20f, 12.7891f, 19.53f, 13.5249f, 18.8729f)
        curveTo(15.0311f, 17.5276f, 12.5581f, 16.4525f, 11.6149f, 15.926f)
        curveTo(9.40321f, 14.6913f, 6.59679f, 14.6913f, 4.38505f, 15.926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 20f)
        horizontalLineTo(19.7048f)
        curveTo(20.4775f, 20f, 21.0921f, 19.624f, 21.6439f, 19.0983f)
        curveTo(22.7736f, 18.0221f, 20.9189f, 17.162f, 20.2115f, 16.7408f)
        curveTo(18.9362f, 15.9814f, 17.3972f, 15.8059f, 16f, 16.2141f)
        }
        }.build()

        return _students!!
    }

private var _students: ImageVector? = null
