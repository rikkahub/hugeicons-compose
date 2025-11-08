package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowDown03: ImageVector
    get() {
        if (_circleArrowDown03 != null) {
            return _circleArrowDown03!!
        }
        _circleArrowDown03 = ImageVector.Builder(
            name = "CircleArrowDown03",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5147f, 11.494f)
        curveTo(13.985f, 12.0258f, 12.6954f, 14.006f, 11.9501f, 13.997f)
        curveTo(11.2121f, 13.9178f, 10.0318f, 11.998f, 9.51097f, 11.4939f)
        moveTo(12.0257f, 6.99835f)
        verticalLineTo(13.9915f)
        moveTo(8.01074f, 17.0018f)
        horizontalLineTo(16.0028f)
        }
        }.build()

        return _circleArrowDown03!!
    }

private var _circleArrowDown03: ImageVector? = null
