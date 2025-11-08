package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowMoveDownRight: ImageVector
    get() {
        if (_circleArrowMoveDownRight != null) {
            return _circleArrowMoveDownRight!!
        }
        _circleArrowMoveDownRight = ImageVector.Builder(
            name = "CircleArrowMoveDownRight",
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
        moveTo(13.6314f, 12.525f)
        curveTo(14.1397f, 13.1552f, 15.1725f, 13.9359f, 14.9886f, 14.3065f)
        moveTo(14.9886f, 14.3065f)
        curveTo(15.091f, 14.6845f, 14.0911f, 15.4315f, 13.6292f, 16.0014f)
        moveTo(14.9886f, 14.3065f)
        curveTo(12.9059f, 14.3518f, 11.6315f, 14.0999f, 10.4014f, 12.875f)
        curveTo(9.12028f, 11.5993f, 8.90953f, 10.2054f, 9.01322f, 7.99683f)
        }
        }.build()

        return _circleArrowMoveDownRight!!
    }

private var _circleArrowMoveDownRight: ImageVector? = null
