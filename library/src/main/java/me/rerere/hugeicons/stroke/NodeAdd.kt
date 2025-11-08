package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NodeAdd: ImageVector
    get() {
        if (_nodeAdd != null) {
            return _nodeAdd!!
        }
        _nodeAdd = ImageVector.Builder(
            name = "NodeAdd",
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
        moveTo(13.5f, 19.5f)
        horizontalLineTo(13f)
        curveTo(10.1716f, 19.5f, 8.75736f, 19.5f, 7.87868f, 18.6213f)
        curveTo(7f, 17.7426f, 7f, 16.3284f, 7f, 13.5f)
        verticalLineTo(11.5f)
        moveTo(7f, 10.5f)
        verticalLineTo(11.5f)
        moveTo(7f, 11.5f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 11.5f)
        curveTo(13.5f, 10.3215f, 13.5f, 9.73223f, 13.8515f, 9.36612f)
        curveTo(14.2029f, 9f, 14.7686f, 9f, 15.9f, 9f)
        horizontalLineTo(17.1f)
        curveTo(18.2314f, 9f, 18.7971f, 9f, 19.1485f, 9.36612f)
        curveTo(19.5f, 9.73223f, 19.5f, 10.3215f, 19.5f, 11.5f)
        curveTo(19.5f, 12.6785f, 19.5f, 13.2678f, 19.1485f, 13.6339f)
        curveTo(18.7971f, 14f, 18.2314f, 14f, 17.1f, 14f)
        horizontalLineTo(15.9f)
        curveTo(14.7686f, 14f, 14.2029f, 14f, 13.8515f, 13.6339f)
        curveTo(13.5f, 13.2678f, 13.5f, 12.6785f, 13.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 19.5f)
        curveTo(13.5f, 18.3215f, 13.5f, 17.7322f, 13.8515f, 17.3661f)
        curveTo(14.2029f, 17f, 14.7686f, 17f, 15.9f, 17f)
        horizontalLineTo(17.1f)
        curveTo(18.2314f, 17f, 18.7971f, 17f, 19.1485f, 17.3661f)
        curveTo(19.5f, 17.7322f, 19.5f, 18.3215f, 19.5f, 19.5f)
        curveTo(19.5f, 20.6785f, 19.5f, 21.2678f, 19.1485f, 21.6339f)
        curveTo(18.7971f, 22f, 18.2314f, 22f, 17.1f, 22f)
        horizontalLineTo(15.9f)
        curveTo(14.7686f, 22f, 14.2029f, 22f, 13.8515f, 21.6339f)
        curveTo(13.5f, 21.2678f, 13.5f, 20.6785f, 13.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 2f)
        verticalLineTo(8f)
        moveTo(10f, 5f)
        lineTo(4f, 5f)
        }
        }.build()

        return _nodeAdd!!
    }

private var _nodeAdd: ImageVector? = null
