package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleTea01: ImageVector
    get() {
        if (_bubbleTea01 != null) {
            return _bubbleTea01!!
        }
        _bubbleTea01 = ImageVector.Builder(
            name = "BubbleTea01",
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
        moveTo(18f, 9f)
        lineTo(16.5218f, 18.4136f)
        curveTo(16.2728f, 19.9992f, 16.1483f, 20.7921f, 15.5864f, 21.2644f)
        curveTo(14.3865f, 22.273f, 9.54699f, 22.217f, 8.41358f, 21.2644f)
        curveTo(7.85167f, 20.7921f, 7.72718f, 19.9992f, 7.47819f, 18.4136f)
        lineTo(6f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        lineTo(6.51444f, 7.71391f)
        curveTo(7.41167f, 5.47084f, 9.58414f, 4f, 12f, 4f)
        curveTo(14.4159f, 4f, 16.5883f, 5.47084f, 17.4856f, 7.71391f)
        lineTo(18f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 9f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        lineTo(16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0089f, 16.5f)
        horizontalLineTo(10f)
        moveTo(14f, 18f)
        horizontalLineTo(13.9911f)
        moveTo(13.0112f, 14f)
        horizontalLineTo(13.0023f)
        }
        }.build()

        return _bubbleTea01!!
    }

private var _bubbleTea01: ImageVector? = null
