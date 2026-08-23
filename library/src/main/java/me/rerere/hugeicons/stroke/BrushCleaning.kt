package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BrushCleaning: ImageVector
    get() {
        if (_brushCleaning != null) {
            return _brushCleaning!!
        }
        _brushCleaning = ImageVector.Builder(
            name = "BrushCleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.25f, 16f)
            lineTo(14.6279f, 19.0232f)
            curveTo(14.8255f, 20.6038f, 13.593f, 22f, 12f, 22f)
            curveTo(10.407f, 22f, 9.17452f, 20.6038f, 9.3721f, 19.0232f)
            lineTo(9.75f, 16f)
            curveTo(9.85134f, 15.1892f, 9.90202f, 14.7839f, 9.72689f, 14.4892f)
            curveTo(9.663f, 14.3816f, 9.57951f, 14.2871f, 9.48074f, 14.2103f)
            curveTo(9.21003f, 14f, 8.8015f, 14f, 7.98444f, 14f)
            horizontalLineTo(7.83046f)
            curveTo(6.10918f, 14f, 5.24854f, 14f, 4.68301f, 13.5052f)
            curveTo(4.61617f, 13.4467f, 4.55331f, 13.3838f, 4.49483f, 13.317f)
            curveTo(4f, 12.7515f, 4f, 11.8908f, 4f, 10.1695f)
            verticalLineTo(10f)
            horizontalLineTo(20f)
            verticalLineTo(10.1695f)
            curveTo(20f, 11.8908f, 20f, 12.7515f, 19.5052f, 13.317f)
            curveTo(19.4467f, 13.3838f, 19.3838f, 13.4467f, 19.317f, 13.5052f)
            curveTo(18.7515f, 14f, 17.8908f, 14f, 16.1695f, 14f)
            horizontalLineTo(16.0156f)
            curveTo(15.1985f, 14f, 14.79f, 14f, 14.5193f, 14.2103f)
            curveTo(14.4205f, 14.2871f, 14.337f, 14.3816f, 14.2731f, 14.4892f)
            curveTo(14.098f, 14.7839f, 14.1487f, 15.1892f, 14.25f, 16f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4f, 10f)
            verticalLineTo(5.51472f)
            curveTo(4f, 5.03662f, 4f, 4.79756f, 4.0272f, 4.59696f)
            curveTo(4.20846f, 3.25997f, 5.25997f, 2.20846f, 6.59696f, 2.0272f)
            curveTo(6.79756f, 2f, 7.03662f, 2f, 7.51472f, 2f)
            curveTo(7.58456f, 2f, 7.61949f, 2f, 7.65311f, 2.00227f)
            curveTo(7.87143f, 2.017f, 8.07889f, 2.10293f, 8.24368f, 2.24689f)
            curveTo(8.26906f, 2.26906f, 8.29376f, 2.29376f, 8.34315f, 2.34315f)
            lineTo(8.58579f, 2.58579f)
            curveTo(9.25245f, 3.25245f, 9.58579f, 3.58579f, 10f, 3.58579f)
            curveTo(10.4142f, 3.58579f, 10.7475f, 3.25245f, 11.4142f, 2.58579f)
            curveTo(11.7032f, 2.29676f, 11.8478f, 2.15224f, 12.0315f, 2.07612f)
            curveTo(12.2153f, 2f, 12.4197f, 2f, 12.8284f, 2f)
            horizontalLineTo(14f)
            curveTo(16.8284f, 2f, 18.2426f, 2f, 19.1213f, 2.87868f)
            curveTo(20f, 3.75736f, 20f, 5.17157f, 20f, 8f)
            verticalLineTo(10f)
        }
        }.build()

        return _brushCleaning!!
    }

private var _brushCleaning: ImageVector? = null
