package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArtboardTool: ImageVector
    get() {
        if (_artboardTool != null) {
            return _artboardTool!!
        }
        _artboardTool = ImageVector.Builder(
            name = "ArtboardTool",
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
        moveTo(9f, 7f)
        horizontalLineTo(15f)
        curveTo(18.2998f, 7f, 19.9497f, 7f, 20.9749f, 8.02513f)
        curveTo(22f, 9.05025f, 22f, 10.7002f, 22f, 14f)
        verticalLineTo(15f)
        curveTo(22f, 18.2998f, 22f, 19.9497f, 20.9749f, 20.9749f)
        curveTo(19.9497f, 22f, 18.2998f, 22f, 15f, 22f)
        horizontalLineTo(14f)
        curveTo(10.7002f, 22f, 9.05025f, 22f, 8.02513f, 20.9749f)
        curveTo(7f, 19.9497f, 7f, 18.2998f, 7f, 15f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        lineTo(5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5f)
        lineTo(7f, 2f)
        }
        }.build()

        return _artboardTool!!
    }

private var _artboardTool: ImageVector? = null
