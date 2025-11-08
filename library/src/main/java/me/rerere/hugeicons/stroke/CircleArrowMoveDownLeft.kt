package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowMoveDownLeft: ImageVector
    get() {
        if (_circleArrowMoveDownLeft != null) {
            return _circleArrowMoveDownLeft!!
        }
        _circleArrowMoveDownLeft = ImageVector.Builder(
            name = "CircleArrowMoveDownLeft",
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
        moveTo(10.3738f, 12.5313f)
        curveTo(9.8655f, 13.1616f, 8.83272f, 13.9422f, 9.01656f, 14.3129f)
        moveTo(9.01656f, 14.3129f)
        curveTo(8.91415f, 14.6908f, 9.91409f, 15.4379f, 10.376f, 16.0078f)
        moveTo(9.01656f, 14.3129f)
        curveTo(11.0993f, 14.3582f, 12.3737f, 14.1062f, 13.6038f, 12.8814f)
        curveTo(14.8849f, 11.6057f, 15.0957f, 10.2118f, 14.992f, 8.00317f)
        }
        }.build()

        return _circleArrowMoveDownLeft!!
    }

private var _circleArrowMoveDownLeft: ImageVector? = null
