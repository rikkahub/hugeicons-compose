package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpRightStack: ImageVector
    get() {
        if (_arrowUpRightStack != null) {
            return _arrowUpRightStack!!
        }
        _arrowUpRightStack = ImageVector.Builder(
            name = "ArrowUpRightStack",
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
        moveTo(14f, 9.99997f)
        lineTo(5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9999f, 19f)
        verticalLineTo(13f)
        curveTo(14.9999f, 11.1144f, 14.9999f, 10.1716f, 14.4141f, 9.58579f)
        curveTo(13.8284f, 9f, 12.8856f, 9f, 10.9999f, 9f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9999f, 19f)
        verticalLineTo(15f)
        curveTo(18.9999f, 10.286f, 18.9999f, 7.92893f, 17.5355f, 6.46447f)
        curveTo(16.071f, 5f, 13.714f, 5f, 8.99994f, 5f)
        horizontalLineTo(5f)
        }
        }.build()

        return _arrowUpRightStack!!
    }

private var _arrowUpRightStack: ImageVector? = null
