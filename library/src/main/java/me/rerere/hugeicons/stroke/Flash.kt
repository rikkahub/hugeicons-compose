package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = ImageVector.Builder(
            name = "Flash",
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
        moveTo(5.22576f, 11.3294f)
        lineTo(12.224f, 2.34651f)
        curveTo(12.7713f, 1.64397f, 13.7972f, 2.08124f, 13.7972f, 3.01707f)
        verticalLineTo(9.96994f)
        curveTo(13.7972f, 10.5305f, 14.1995f, 10.985f, 14.6958f, 10.985f)
        horizontalLineTo(18.0996f)
        curveTo(18.8729f, 10.985f, 19.2851f, 12.0149f, 18.7742f, 12.6706f)
        lineTo(11.776f, 21.6535f)
        curveTo(11.2287f, 22.356f, 10.2028f, 21.9188f, 10.2028f, 20.9829f)
        verticalLineTo(14.0301f)
        curveTo(10.2028f, 13.4695f, 9.80048f, 13.015f, 9.3042f, 13.015f)
        horizontalLineTo(5.90035f)
        curveTo(5.12711f, 13.015f, 4.71494f, 11.9851f, 5.22576f, 11.3294f)
        }
        }.build()

        return _flash!!
    }

private var _flash: ImageVector? = null
