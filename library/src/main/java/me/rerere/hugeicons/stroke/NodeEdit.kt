package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NodeEdit: ImageVector
    get() {
        if (_nodeEdit != null) {
            return _nodeEdit!!
        }
        _nodeEdit = ImageVector.Builder(
            name = "NodeEdit",
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
        moveTo(13f, 19.5f)
        horizontalLineTo(12f)
        curveTo(9.17157f, 19.5f, 7.75736f, 19.5f, 6.87868f, 18.6213f)
        curveTo(6f, 17.7426f, 6f, 16.3284f, 6f, 13.5f)
        verticalLineTo(11.5f)
        moveTo(6f, 11.5f)
        verticalLineTo(8f)
        moveTo(6f, 11.5f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19.5f)
        curveTo(13f, 18.3215f, 13f, 17.7322f, 13.3515f, 17.3661f)
        curveTo(13.7029f, 17f, 14.2686f, 17f, 15.4f, 17f)
        horizontalLineTo(16.6f)
        curveTo(17.7314f, 17f, 18.2971f, 17f, 18.6485f, 17.3661f)
        curveTo(19f, 17.7322f, 19f, 18.3215f, 19f, 19.5f)
        curveTo(19f, 20.6785f, 19f, 21.2678f, 18.6485f, 21.6339f)
        curveTo(18.2971f, 22f, 17.7314f, 22f, 16.6f, 22f)
        horizontalLineTo(15.4f)
        curveTo(14.2686f, 22f, 13.7029f, 22f, 13.3515f, 21.6339f)
        curveTo(13f, 21.2678f, 13f, 20.6785f, 13f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.28571f, 2f)
        horizontalLineTo(7.71429f)
        curveTo(9.7888f, 2f, 10f, 3.10993f, 10f, 5f)
        curveTo(10f, 6.89007f, 9.7888f, 8f, 7.71429f, 8f)
        horizontalLineTo(4.28571f)
        curveTo(2.2112f, 8f, 2f, 6.89007f, 2f, 5f)
        curveTo(2f, 3.10993f, 2.2112f, 2f, 4.28571f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0058f, 5.38441f)
        lineTo(21.614f, 5.99021f)
        curveTo(22.1286f, 6.50276f, 22.1286f, 7.33376f, 21.6141f, 7.84631f)
        lineTo(18.4275f, 11.0799f)
        curveTo(18.1768f, 11.3296f, 17.8561f, 11.4979f, 17.5077f, 11.5627f)
        lineTo(15.5327f, 11.9898f)
        curveTo(15.2209f, 12.0572f, 14.9432f, 11.7814f, 15.01f, 11.4706f)
        lineTo(15.4304f, 9.5148f)
        curveTo(15.4955f, 9.1677f, 15.6645f, 8.84834f, 15.9151f, 8.59867f)
        lineTo(19.1423f, 5.38441f)
        curveTo(19.6569f, 4.87186f, 20.4912f, 4.87186f, 21.0058f, 5.38441f)
        }
        }.build()

        return _nodeEdit!!
    }

private var _nodeEdit: ImageVector? = null
