package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UnfoldMore: ImageVector
    get() {
        if (_unfoldMore != null) {
            return _unfoldMore!!
        }
        _unfoldMore = ImageVector.Builder(
            name = "UnfoldMore",
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
        moveTo(17.9999f, 14f)
        curveTo(17.9999f, 14f, 13.581f, 19f, 11.9999f, 19f)
        curveTo(10.4188f, 19f, 5.99994f, 14f, 5.99994f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9999f, 9.99996f)
        curveTo(17.9999f, 9.99996f, 13.581f, 5.00001f, 11.9999f, 5f)
        curveTo(10.4188f, 4.99999f, 5.99994f, 10f, 5.99994f, 10f)
        }
        }.build()

        return _unfoldMore!!
    }

private var _unfoldMore: ImageVector? = null
