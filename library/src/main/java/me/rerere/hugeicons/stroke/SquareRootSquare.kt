package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareRootSquare: ImageVector
    get() {
        if (_squareRootSquare != null) {
            return _squareRootSquare!!
        }
        _squareRootSquare = ImageVector.Builder(
            name = "SquareRootSquare",
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
        moveTo(18f, 7.99011f)
        horizontalLineTo(12.5167f)
        curveTo(11.7f, 7.99011f, 11.46f, 8.03011f, 11.299f, 8.85416f)
        lineTo(9.95406f, 14.4594f)
        curveTo(9.62198f, 15.7875f, 9.45066f, 15.9835f, 9.12f, 16.0101f)
        curveTo(8.76f, 15.8901f, 8.58977f, 15.5824f, 7.98f, 14.3301f)
        lineTo(7.63508f, 13.5701f)
        curveTo(7.37243f, 13.0307f, 7.28553f, 12.8031f, 7.02f, 12.7301f)
        curveTo(6.62037f, 12.6201f, 6.30716f, 12.9309f, 6f, 13.1301f)
        moveTo(13.1035f, 11.4222f)
        curveTo(13.5235f, 11.4083f, 13.9795f, 11.3902f, 14.2291f, 11.8062f)
        curveTo(14.5724f, 12.4986f, 15.1156f, 13.9174f, 15.3175f, 14.3675f)
        curveTo(15.4185f, 14.5406f, 15.4795f, 14.6902f, 15.8395f, 14.8102f)
        curveTo(16.1088f, 14.8448f, 16.4995f, 14.8542f, 16.4995f, 14.8542f)
        moveTo(16.7407f, 11.41f)
        curveTo(15.8945f, 11.41f, 15.3905f, 12.356f, 14.9167f, 12.9488f)
        curveTo(14.3074f, 13.8555f, 13.6807f, 14.87f, 12.8887f, 14.842f)
        }
        }.build()

        return _squareRootSquare!!
    }

private var _squareRootSquare: ImageVector? = null
