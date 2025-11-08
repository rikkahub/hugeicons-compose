package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareCircle: ImageVector
    get() {
        if (_squareCircle != null) {
            return _squareCircle!!
        }
        _squareCircle = ImageVector.Builder(
            name = "SquareCircle",
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
        moveTo(7.29297f, 11.208f)
        curveTo(7.95663f, 11.1731f, 8.50071f, 11.2088f, 8.76097f, 11.82f)
        curveTo(9.06097f, 12.5245f, 9.90097f, 14.76f, 10.081f, 15.24f)
        curveTo(10.2885f, 15.7933f, 10.621f, 16.08f, 11.625f, 15.996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9119f, 11.208f)
        curveTo(10.8319f, 11.148f, 9.89767f, 12.8632f, 9.4639f, 13.62f)
        curveTo(8.9239f, 14.46f, 8.0399f, 16.02f, 7.00391f, 15.996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 11f)
        horizontalLineTo(14.5f)
        curveTo(14.5f, 11f, 16.5049f, 9.67917f, 16.7244f, 9.52908f)
        curveTo(16.9439f, 9.37899f, 17.5f, 9.05382f, 17.5f, 8.32833f)
        curveTo(17.5f, 7.60284f, 16.7751f, 6.99999f, 16.0073f, 7f)
        curveTo(15.2396f, 7.00001f, 14.5f, 7.53452f, 14.5f, 8.33583f)
        }
        }.build()

        return _squareCircle!!
    }

private var _squareCircle: ImageVector? = null
