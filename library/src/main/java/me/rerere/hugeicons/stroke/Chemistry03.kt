package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chemistry03: ImageVector
    get() {
        if (_chemistry03 != null) {
            return _chemistry03!!
        }
        _chemistry03 = ImageVector.Builder(
            name = "Chemistry03",
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
        moveTo(5f, 3f)
        verticalLineTo(13f)
        curveTo(5f, 16.7712f, 5f, 18.6569f, 6.17157f, 19.8284f)
        curveTo(7.34315f, 21f, 9.22876f, 21f, 13f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        lineTo(11f, 9f)
        moveTo(20f, 9f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 4f)
        lineTo(16.5f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7f, 4f)
        verticalLineTo(8.95233f)
        curveTo(11.7f, 9.35352f, 11.4544f, 9.70728f, 11.1119f, 9.91618f)
        curveTo(9.84338f, 10.6899f, 9f, 12.0617f, 9f, 13.625f)
        curveTo(9f, 16.0412f, 11.0147f, 18f, 13.5f, 18f)
        curveTo(15.9853f, 18f, 18f, 16.0412f, 18f, 13.625f)
        curveTo(18f, 12.0617f, 17.1566f, 10.6899f, 15.8881f, 9.91618f)
        curveTo(15.5456f, 9.70728f, 15.3f, 9.35352f, 15.3f, 8.95233f)
        verticalLineTo(4f)
        }
        }.build()

        return _chemistry03!!
    }

private var _chemistry03: ImageVector? = null
