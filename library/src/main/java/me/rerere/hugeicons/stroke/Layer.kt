package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Layer: ImageVector
    get() {
        if (_layer != null) {
            return _layer!!
        }
        _layer = ImageVector.Builder(
            name = "Layer",
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
        moveTo(9.60573f, 4.81298f)
        curveTo(10.7856f, 4.27099f, 11.3755f, 4f, 12f, 4f)
        curveTo(12.6245f, 4f, 13.2144f, 4.27099f, 14.3943f, 4.81298f)
        lineTo(19.2873f, 7.06064f)
        curveTo(21.0958f, 7.89137f, 22f, 8.30674f, 22f, 9f)
        curveTo(22f, 9.69326f, 21.0958f, 10.1086f, 19.2873f, 10.9394f)
        lineTo(14.3943f, 13.187f)
        curveTo(13.2144f, 13.729f, 12.6245f, 14f, 12f, 14f)
        curveTo(11.3755f, 14f, 10.7856f, 13.729f, 9.60573f, 13.187f)
        lineTo(4.7127f, 10.9394f)
        curveTo(2.90423f, 10.1086f, 2f, 9.69326f, 2f, 9f)
        curveTo(2f, 8.30674f, 2.90423f, 7.89137f, 4.7127f, 7.06064f)
        lineTo(9.60573f, 4.81298f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.2327f, 13.5f)
        curveTo(21.4109f, 14.062f, 22f, 14.4405f, 22f, 15.0001f)
        curveTo(22f, 15.6934f, 21.0958f, 16.1087f, 19.2873f, 16.9395f)
        lineTo(14.3943f, 19.1871f)
        curveTo(13.2144f, 19.7291f, 12.6245f, 20.0001f, 12f, 20.0001f)
        curveTo(11.3755f, 20.0001f, 10.7856f, 19.7291f, 9.60573f, 19.1871f)
        lineTo(4.7127f, 16.9395f)
        curveTo(2.90423f, 16.1087f, 2f, 15.6934f, 2f, 15.0001f)
        curveTo(2f, 14.4405f, 2.58909f, 14.062f, 3.76727f, 13.5f)
        }
        }.build()

        return _layer!!
    }

private var _layer: ImageVector? = null
