package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GitCompare: ImageVector
    get() {
        if (_gitCompare != null) {
            return _gitCompare!!
        }
        _gitCompare = ImageVector.Builder(
            name = "GitCompare",
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
        moveTo(19f, 17f)
        lineTo(19f, 11f)
        curveTo(19f, 8.17157f, 19f, 6.75736f, 18.1213f, 5.87868f)
        curveTo(17.2426f, 5f, 15.8284f, 5f, 13f, 5f)
        horizontalLineTo(10f)
        moveTo(10f, 5f)
        curveTo(10f, 4.29977f, 11.9943f, 2.99153f, 12.5f, 2.5f)
        moveTo(10f, 5f)
        curveTo(10f, 5.70023f, 11.9943f, 7.00847f, 12.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 7.5f)
        lineTo(5f, 13.5f)
        curveTo(5f, 16.3284f, 5f, 17.7426f, 5.87868f, 18.6213f)
        curveTo(6.75736f, 19.5f, 8.17157f, 19.5f, 11f, 19.5f)
        horizontalLineTo(14f)
        moveTo(14f, 19.5f)
        curveTo(14f, 20.2002f, 12.0057f, 21.5085f, 11.5f, 22f)
        moveTo(14f, 19.5f)
        curveTo(14f, 18.7998f, 12.0057f, 17.4915f, 11.5f, 17f)
        }
        }.build()

        return _gitCompare!!
    }

private var _gitCompare: ImageVector? = null
