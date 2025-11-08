package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDown04: ImageVector
    get() {
        if (_arrowDown04 != null) {
            return _arrowDown04!!
        }
        _arrowDown04 = ImageVector.Builder(
            name = "ArrowDown04",
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
        moveTo(10.3974f, 18.5859f)
        lineTo(9.63609f, 17.6194f)
        curveTo(8.40261f, 16.0536f, 7.78587f, 15.2707f, 8.06718f, 14.6354f)
        curveTo(8.3485f, 14f, 9.31188f, 14f, 11.2386f, 14f)
        horizontalLineTo(12.7613f)
        curveTo(14.6881f, 14f, 15.6514f, 14f, 15.9328f, 14.6354f)
        curveTo(16.2141f, 15.2707f, 15.5973f, 16.0536f, 14.3638f, 17.6194f)
        lineTo(13.6025f, 18.5858f)
        curveTo(12.8598f, 19.5286f, 12.4885f, 20f, 12f, 20f)
        curveTo(11.5114f, 20f, 11.1401f, 19.5286f, 10.3974f, 18.5859f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        lineTo(12f, 4f)
        }
        }.build()

        return _arrowDown04!!
    }

private var _arrowDown04: ImageVector? = null
