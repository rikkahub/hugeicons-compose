package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Asteroid02: ImageVector
    get() {
        if (_asteroid02 != null) {
            return _asteroid02!!
        }
        _asteroid02 = ImageVector.Builder(
            name = "Asteroid02",
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
        moveTo(17f, 14.5f)
        curveTo(17f, 18.6421f, 13.6421f, 22f, 9.5f, 22f)
        curveTo(5.35786f, 22f, 2f, 18.6421f, 2f, 14.5f)
        curveTo(2f, 10.3579f, 5.35786f, 7f, 9.5f, 7f)
        curveTo(13.6421f, 7f, 17f, 10.3579f, 17f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 13f)
        lineTo(14.5f, 5.50003f)
        moveTo(18f, 2f)
        lineTo(16.5f, 3.5f)
        moveTo(22f, 6.00003f)
        lineTo(19f, 9f)
        moveTo(11f, 16f)
        lineTo(14f, 13f)
        }
        }.build()

        return _asteroid02!!
    }

private var _asteroid02: ImageVector? = null
