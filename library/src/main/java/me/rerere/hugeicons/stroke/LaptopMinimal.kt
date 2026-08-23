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

val HugeIcons.LaptopMinimal: ImageVector
    get() {
        if (_laptopMinimal != null) {
            return _laptopMinimal!!
        }
        _laptopMinimal = ImageVector.Builder(
            name = "LaptopMinimal",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99609f, 17.8182f)
            curveTo(1.99609f, 17.7549f, 1.99609f, 17.7232f, 1.998f, 17.6965f)
            curveTo(2.02461f, 17.3245f, 2.32056f, 17.0285f, 2.69259f, 17.0019f)
            curveTo(2.71931f, 17f, 2.75096f, 17f, 2.81428f, 17f)
            horizontalLineTo(21.1779f)
            curveTo(21.2412f, 17f, 21.2729f, 17f, 21.2996f, 17.0019f)
            curveTo(21.6716f, 17.0285f, 21.9676f, 17.3245f, 21.9942f, 17.6965f)
            curveTo(21.9961f, 17.7232f, 21.9961f, 17.7549f, 21.9961f, 17.8182f)
            curveTo(21.9961f, 17.987f, 21.9961f, 18.0714f, 21.991f, 18.1427f)
            curveTo(21.92f, 19.1348f, 21.1309f, 19.9239f, 20.1388f, 19.9949f)
            curveTo(20.0675f, 20f, 19.9831f, 20f, 19.8143f, 20f)
            horizontalLineTo(4.17791f)
            curveTo(4.00908f, 20f, 3.92466f, 20f, 3.85342f, 19.9949f)
            curveTo(2.86133f, 19.9239f, 2.07214f, 19.1348f, 2.00119f, 18.1427f)
            curveTo(1.99609f, 18.0714f, 1.99609f, 17.987f, 1.99609f, 17.8182f)
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
            moveTo(3.49609f, 17f)
            verticalLineTo(10f)
            curveTo(3.49609f, 7.17157f, 3.49609f, 5.75736f, 4.37477f, 4.87868f)
            curveTo(5.25345f, 4f, 6.66767f, 4f, 9.49609f, 4f)
            horizontalLineTo(14.4961f)
            curveTo(17.3245f, 4f, 18.7387f, 4f, 19.6174f, 4.87868f)
            curveTo(20.4961f, 5.75736f, 20.4961f, 7.17157f, 20.4961f, 10f)
            verticalLineTo(17f)
        }
        }.build()

        return _laptopMinimal!!
    }

private var _laptopMinimal: ImageVector? = null
