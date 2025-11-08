package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SubnodeAdd: ImageVector
    get() {
        if (_subnodeAdd != null) {
            return _subnodeAdd!!
        }
        _subnodeAdd = ImageVector.Builder(
            name = "SubnodeAdd",
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
        moveTo(14.5f, 19.5f)
        horizontalLineTo(13.5f)
        curveTo(10.6716f, 19.5f, 9.25736f, 19.5f, 8.37868f, 18.6213f)
        curveTo(7.5f, 17.7426f, 7.5f, 16.3284f, 7.5f, 13.5f)
        verticalLineTo(11.5f)
        moveTo(7.5f, 8f)
        verticalLineTo(11.5f)
        moveTo(7.5f, 11.5f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 19.5f)
        curveTo(14.5f, 18.3215f, 14.5f, 17.7322f, 14.8515f, 17.3661f)
        curveTo(15.2029f, 17f, 15.7686f, 17f, 16.9f, 17f)
        horizontalLineTo(18.1f)
        curveTo(19.2314f, 17f, 19.7971f, 17f, 20.1485f, 17.3661f)
        curveTo(20.5f, 17.7322f, 20.5f, 18.3215f, 20.5f, 19.5f)
        curveTo(20.5f, 20.6785f, 20.5f, 21.2678f, 20.1485f, 21.6339f)
        curveTo(19.7971f, 22f, 19.2314f, 22f, 18.1f, 22f)
        horizontalLineTo(16.9f)
        curveTo(15.7686f, 22f, 15.2029f, 22f, 14.8515f, 21.6339f)
        curveTo(14.5f, 21.2678f, 14.5f, 20.6785f, 14.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.78571f, 2f)
        horizontalLineTo(9.21429f)
        curveTo(11.2888f, 2f, 11.5f, 3.10993f, 11.5f, 5f)
        curveTo(11.5f, 6.89007f, 11.2888f, 8f, 9.21429f, 8f)
        horizontalLineTo(5.78571f)
        curveTo(3.7112f, 8f, 3.5f, 6.89007f, 3.5f, 5f)
        curveTo(3.5f, 3.10993f, 3.7112f, 2f, 5.78571f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 9f)
        verticalLineTo(14f)
        moveTo(20f, 11.5f)
        lineTo(15f, 11.5f)
        }
        }.build()

        return _subnodeAdd!!
    }

private var _subnodeAdd: ImageVector? = null
