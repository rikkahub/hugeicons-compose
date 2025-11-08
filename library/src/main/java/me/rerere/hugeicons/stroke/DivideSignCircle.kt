package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DivideSignCircle: ImageVector
    get() {
        if (_divideSignCircle != null) {
            return _divideSignCircle!!
        }
        _divideSignCircle = ImageVector.Builder(
            name = "DivideSignCircle",
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
        moveTo(7f, 12f)
        horizontalLineTo(17f)
        moveTo(13f, 8f)
        curveTo(13f, 8.55228f, 12.5523f, 9f, 12f, 9f)
        curveTo(11.4477f, 9f, 11f, 8.55228f, 11f, 8f)
        curveTo(11f, 7.44772f, 11.4477f, 7f, 12f, 7f)
        curveTo(12.5523f, 7f, 13f, 7.44772f, 13f, 8f)
        moveTo(13f, 16f)
        curveTo(13f, 16.5523f, 12.5523f, 17f, 12f, 17f)
        curveTo(11.4477f, 17f, 11f, 16.5523f, 11f, 16f)
        curveTo(11f, 15.4477f, 11.4477f, 15f, 12f, 15f)
        curveTo(12.5523f, 15f, 13f, 15.4477f, 13f, 16f)
        }
        }.build()

        return _divideSignCircle!!
    }

private var _divideSignCircle: ImageVector? = null
