package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PropertyView: ImageVector
    get() {
        if (_propertyView != null) {
            return _propertyView!!
        }
        _propertyView = ImageVector.Builder(
            name = "PropertyView",
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
        moveTo(20.9977f, 12.5032f)
        curveTo(20.9977f, 12.5032f, 21f, 12.0338f, 21f, 11.5029f)
        curveTo(21f, 7.02321f, 21f, 4.78334f, 19.6088f, 3.39167f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.39167f)
        curveTo(2f, 4.78334f, 2f, 7.02321f, 2f, 11.5029f)
        curveTo(2f, 15.9827f, 2f, 18.2225f, 3.39124f, 19.6142f)
        curveTo(4.55785f, 20.7812f, 6.32067f, 20.9696f, 9.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16f)
        horizontalLineTo(7f)
        moveTo(10f, 12f)
        horizontalLineTo(15f)
        moveTo(6f, 12f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 18.5f)
        horizontalLineTo(17.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.772f, 18.0225f)
        curveTo(21.924f, 18.2357f, 22f, 18.3422f, 22f, 18.5f)
        curveTo(22f, 18.6578f, 21.924f, 18.7643f, 21.772f, 18.9775f)
        curveTo(21.089f, 19.9353f, 19.3446f, 22f, 17f, 22f)
        curveTo(14.6554f, 22f, 12.911f, 19.9353f, 12.228f, 18.9775f)
        curveTo(12.076f, 18.7643f, 12f, 18.6578f, 12f, 18.5f)
        curveTo(12f, 18.3422f, 12.076f, 18.2357f, 12.228f, 18.0225f)
        curveTo(12.911f, 17.0647f, 14.6554f, 15f, 17f, 15f)
        curveTo(19.3446f, 15f, 21.089f, 17.0647f, 21.772f, 18.0225f)
        }
        }.build()

        return _propertyView!!
    }

private var _propertyView: ImageVector? = null
