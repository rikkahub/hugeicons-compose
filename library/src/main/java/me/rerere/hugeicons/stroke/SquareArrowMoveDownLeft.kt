package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowMoveDownLeft: ImageVector
    get() {
        if (_squareArrowMoveDownLeft != null) {
            return _squareArrowMoveDownLeft!!
        }
        _squareArrowMoveDownLeft = ImageVector.Builder(
            name = "SquareArrowMoveDownLeft",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.84166f, 12.6589f)
        curveTo(9.16929f, 13.4488f, 7.80302f, 14.4272f, 8.04622f, 14.8917f)
        moveTo(8.04622f, 14.8917f)
        curveTo(7.91074f, 15.3654f, 9.23356f, 16.3017f, 9.84465f, 17.016f)
        moveTo(8.04622f, 14.8917f)
        curveTo(10.8015f, 14.9485f, 12.4873f, 14.6328f, 14.1146f, 13.0977f)
        curveTo(15.8094f, 11.4988f, 16.1249f, 9.77339f, 15.9877f, 7.00537f)
        }
        }.build()

        return _squareArrowMoveDownLeft!!
    }

private var _squareArrowMoveDownLeft: ImageVector? = null
