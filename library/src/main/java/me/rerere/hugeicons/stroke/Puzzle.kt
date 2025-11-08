package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Puzzle: ImageVector
    get() {
        if (_puzzle != null) {
            return _puzzle!!
        }
        _puzzle = ImageVector.Builder(
            name = "Puzzle",
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
        moveTo(12.828f, 6.00096f)
        curveTo(12.9388f, 5.68791f, 12.999f, 5.35099f, 12.999f, 5f)
        curveTo(12.999f, 3.34315f, 11.6559f, 2f, 9.99904f, 2f)
        curveTo(8.34219f, 2f, 6.99904f, 3.34315f, 6.99904f, 5f)
        curveTo(6.99904f, 5.35099f, 7.05932f, 5.68791f, 7.17008f, 6.00096f)
        curveTo(4.88532f, 6.0093f, 3.66601f, 6.09039f, 2.87772f, 6.87868f)
        curveTo(2.08951f, 7.66689f, 2.00836f, 8.88603f, 2f, 11.1704f)
        curveTo(2.31251f, 11.06f, 2.64876f, 11f, 2.99904f, 11f)
        curveTo(4.6559f, 11f, 5.99904f, 12.3431f, 5.99904f, 14f)
        curveTo(5.99904f, 15.6569f, 4.6559f, 17f, 2.99904f, 17f)
        curveTo(2.64876f, 17f, 2.31251f, 16.94f, 2f, 16.8296f)
        curveTo(2.00836f, 19.114f, 2.08951f, 20.3331f, 2.87772f, 21.1213f)
        curveTo(3.66593f, 21.9095f, 4.88508f, 21.9907f, 7.16941f, 21.999f)
        curveTo(7.05908f, 21.6865f, 6.99904f, 21.3503f, 6.99904f, 21f)
        curveTo(6.99904f, 19.3431f, 8.34219f, 18f, 9.99904f, 18f)
        curveTo(11.6559f, 18f, 12.999f, 19.3431f, 12.999f, 21f)
        curveTo(12.999f, 21.3503f, 12.939f, 21.6865f, 12.8287f, 21.999f)
        curveTo(15.113f, 21.9907f, 16.3322f, 21.9095f, 17.1204f, 21.1213f)
        curveTo(17.9086f, 20.333f, 17.9897f, 19.1137f, 17.9981f, 16.829f)
        curveTo(18.3111f, 16.9397f, 18.648f, 17f, 18.999f, 17f)
        curveTo(20.6559f, 17f, 21.999f, 15.6569f, 21.999f, 14f)
        curveTo(21.999f, 12.3431f, 20.6559f, 11f, 18.999f, 11f)
        curveTo(18.648f, 11f, 18.3111f, 11.0603f, 17.9981f, 11.171f)
        curveTo(17.9897f, 8.88627f, 17.9086f, 7.66697f, 17.1204f, 6.87868f)
        curveTo(16.3321f, 6.09039f, 15.1128f, 6.0093f, 12.828f, 6.00096f)
        }
        }.build()

        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
