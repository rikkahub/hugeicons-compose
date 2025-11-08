package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchReplace: ImageVector
    get() {
        if (_searchReplace != null) {
            return _searchReplace!!
        }
        _searchReplace = ImageVector.Builder(
            name = "SearchReplace",
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
        moveTo(17.5001f, 17.5f)
        lineTo(22.0001f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.0001f, 11f)
        curveTo(20.0001f, 15.9706f, 15.9707f, 20f, 11.0001f, 20f)
        curveTo(7.46637f, 20f, 4.40831f, 17.9634f, 2.93561f, 15f)
        moveTo(2.00009f, 11f)
        curveTo(2.00009f, 6.02944f, 6.02953f, 2f, 11.0001f, 2f)
        curveTo(14.5338f, 2f, 17.5919f, 4.03656f, 19.0646f, 7f)
        moveTo(19.0646f, 7f)
        verticalLineTo(2f)
        moveTo(19.0646f, 7f)
        horizontalLineTo(14.5001f)
        moveTo(2.93561f, 15f)
        lineTo(2.93561f, 20f)
        moveTo(2.93561f, 15f)
        lineTo(7.50009f, 15f)
        }
        }.build()

        return _searchReplace!!
    }

private var _searchReplace: ImageVector? = null
