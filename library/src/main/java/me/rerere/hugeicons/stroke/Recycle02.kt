package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Recycle02: ImageVector
    get() {
        if (_recycle02 != null) {
            return _recycle02!!
        }
        _recycle02 = ImageVector.Builder(
            name = "Recycle02",
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
        moveTo(10.8386f, 19.7631f)
        horizontalLineTo(16.4671f)
        curveTo(19.3324f, 19.7631f, 20.7651f, 19.7631f, 21.4622f, 19.0038f)
        curveTo(21.6578f, 18.7907f, 21.8093f, 18.544f, 21.9087f, 18.2766f)
        curveTo(22.2627f, 17.3239f, 21.567f, 16.1237f, 20.1754f, 13.7234f)
        moveTo(10.8386f, 19.7631f)
        lineTo(13.7564f, 17.5262f)
        moveTo(10.8386f, 19.7631f)
        lineTo(13.7564f, 22f)
        moveTo(18.4896f, 10.8154f)
        lineTo(15.507f, 5.6705f)
        curveTo(14.2306f, 3.4687f, 13.5924f, 2.36781f, 12.7003f, 2.10134f)
        curveTo(12.248f, 1.96622f, 11.7634f, 1.96622f, 11.3111f, 2.10134f)
        curveTo(10.419f, 2.36781f, 9.78081f, 3.4687f, 8.50438f, 5.6705f)
        moveTo(18.4896f, 10.8154f)
        lineTo(15.0117f, 9.50645f)
        moveTo(18.4896f, 10.8154f)
        lineTo(19.0588f, 7.27638f)
        moveTo(6.81856f, 8.57849f)
        lineTo(3.73542f, 13.8968f)
        curveTo(2.43531f, 16.1395f, 1.78525f, 17.2608f, 2.06354f, 18.1613f)
        curveTo(2.17186f, 18.5119f, 2.36819f, 18.8316f, 2.63534f, 19.0926f)
        curveTo(3.32163f, 19.7631f, 4.66018f, 19.7631f, 7.33728f, 19.7631f)
        moveTo(6.81856f, 8.57849f)
        lineTo(7.36018f, 12.1215f)
        moveTo(6.81856f, 8.57849f)
        lineTo(3.33053f, 9.8626f)
        }
        }.build()

        return _recycle02!!
    }

private var _recycle02: ImageVector? = null
