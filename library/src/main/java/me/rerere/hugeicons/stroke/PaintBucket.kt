package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = ImageVector.Builder(
            name = "PaintBucket",
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
        moveTo(19f, 12.1294f)
        lineTo(12.9388f, 18.207f)
        curveTo(11.1557f, 19.9949f, 10.2641f, 20.8889f, 9.16993f, 20.9877f)
        curveTo(8.98904f, 21.0041f, 8.80705f, 21.0041f, 8.62616f, 20.9877f)
        curveTo(7.53195f, 20.8889f, 6.64039f, 19.9949f, 4.85726f, 18.207f)
        lineTo(2.83687f, 16.1811f)
        curveTo(1.72104f, 15.0622f, 1.72104f, 13.2482f, 2.83687f, 12.1294f)
        moveTo(19f, 12.1294f)
        lineTo(10.9184f, 4.02587f)
        moveTo(19f, 12.1294f)
        horizontalLineTo(2.83687f)
        moveTo(10.9184f, 4.02587f)
        lineTo(2.83687f, 12.1294f)
        moveTo(10.9184f, 4.02587f)
        lineTo(8.89805f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 20f)
        curveTo(22f, 21.1046f, 21.1046f, 22f, 20f, 22f)
        curveTo(18.8954f, 22f, 18f, 21.1046f, 18f, 20f)
        curveTo(18f, 18.8954f, 20f, 17f, 20f, 17f)
        curveTo(20f, 17f, 22f, 18.8954f, 22f, 20f)
        }
        }.build()

        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
