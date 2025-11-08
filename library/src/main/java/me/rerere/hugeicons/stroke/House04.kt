package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.House04: ImageVector
    get() {
        if (_house04 != null) {
            return _house04!!
        }
        _house04 = ImageVector.Builder(
            name = "House04",
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
        moveTo(7f, 9f)
        lineTo(11.7707f, 4.73514f)
        curveTo(13.0647f, 3.57838f, 13.7117f, 3f, 14.5f, 3f)
        curveTo(15.2883f, 3f, 15.9353f, 3.57838f, 17.2293f, 4.73514f)
        lineTo(22f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 8f)
        verticalLineTo(20f)
        moveTo(20.5f, 20f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 14f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 20f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        verticalLineTo(15.9997f)
        curveTo(12f, 15.0571f, 12f, 14.5858f, 12.2929f, 14.2929f)
        curveTo(12.5858f, 14f, 13.0572f, 14f, 14f, 14f)
        horizontalLineTo(15f)
        curveTo(15.9428f, 14f, 16.4142f, 14f, 16.7071f, 14.2929f)
        curveTo(17f, 14.5858f, 17f, 15.0572f, 17f, 16f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 11f)
        horizontalLineTo(15.5f)
        moveTo(13.5f, 8f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _house04!!
    }

private var _house04: ImageVector? = null
