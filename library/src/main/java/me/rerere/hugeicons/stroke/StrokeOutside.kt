package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StrokeOutside: ImageVector
    get() {
        if (_strokeOutside != null) {
            return _strokeOutside!!
        }
        _strokeOutside = ImageVector.Builder(
            name = "StrokeOutside",
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
        moveTo(18f, 13f)
        curveTo(19.8856f, 13f, 20.8284f, 13f, 21.4142f, 13.5858f)
        curveTo(22f, 14.1716f, 22f, 15.1144f, 22f, 17f)
        verticalLineTo(18f)
        curveTo(22f, 19.8856f, 22f, 20.8284f, 21.4142f, 21.4142f)
        curveTo(20.8284f, 22f, 19.8856f, 22f, 18f, 22f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 22f, 3.75736f, 22f, 2.87868f, 21.1213f)
        curveTo(2f, 20.2426f, 2f, 18.8284f, 2f, 16f)
        lineTo(2f, 6f)
        curveTo(2f, 4.11438f, 2f, 3.17157f, 2.58579f, 2.58579f)
        curveTo(3.17157f, 2f, 4.11438f, 2f, 6f, 2f)
        lineTo(7f, 2f)
        curveTo(8.88562f, 2f, 9.82843f, 2f, 10.4142f, 2.58579f)
        curveTo(11f, 3.17157f, 11f, 4.11438f, 11f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 13.6569f, 13.6569f, 15f, 12f, 15f)
        curveTo(10.3431f, 15f, 9f, 13.6569f, 9f, 12f)
        curveTo(9f, 10.3431f, 10.3431f, 9f, 12f, 9f)
        curveTo(13.6569f, 9f, 15f, 10.3431f, 15f, 12f)
        }
        }.build()

        return _strokeOutside!!
    }

private var _strokeOutside: ImageVector? = null
