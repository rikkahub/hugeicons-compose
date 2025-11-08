package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageAdd01: ImageVector
    get() {
        if (_imageAdd01 != null) {
            return _imageAdd01!!
        }
        _imageAdd01 = ImageVector.Builder(
            name = "ImageAdd01",
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
        moveTo(11.5085f, 2.9903f)
        curveTo(7.02567f, 2.9903f, 4.78428f, 2.9903f, 3.39164f, 4.38238f)
        curveTo(1.99902f, 5.77447f, 1.99902f, 8.015f, 1.99902f, 12.4961f)
        curveTo(1.99902f, 16.9771f, 1.99902f, 19.2176f, 3.39164f, 20.6098f)
        curveTo(4.78428f, 22.0018f, 7.02567f, 22.0018f, 11.5085f, 22.0018f)
        curveTo(15.9912f, 22.0018f, 18.2326f, 22.0018f, 19.6253f, 20.6098f)
        curveTo(21.0179f, 19.2176f, 21.0179f, 16.9771f, 21.0179f, 12.4961f)
        verticalLineTo(11.9958f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.99902f, 20.9898f)
        curveTo(9.209f, 16.2385f, 13.9402f, 9.93727f, 20.999f, 14.6632f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9958f, 1.99829f)
        verticalLineTo(10.0064f)
        moveTo(22.0014f, 5.97728f)
        lineTo(13.9902f, 5.99217f)
        }
        }.build()

        return _imageAdd01!!
    }

private var _imageAdd01: ImageVector? = null
