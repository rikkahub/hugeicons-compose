package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Playlist03: ImageVector
    get() {
        if (_playlist03 != null) {
            return _playlist03!!
        }
        _playlist03 = ImageVector.Builder(
            name = "Playlist03",
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
        moveTo(2f, 3f)
        lineTo(20f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10f)
        lineTo(15f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        lineTo(9f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.25f, 19f)
        curveTo(18.25f, 20.6569f, 16.8509f, 22f, 15.125f, 22f)
        curveTo(13.3991f, 22f, 12f, 20.6569f, 12f, 19f)
        curveTo(12f, 17.3431f, 13.3991f, 16f, 15.125f, 16f)
        curveTo(16.8509f, 16f, 18.25f, 17.3431f, 18.25f, 19f)
        moveTo(18.25f, 19f)
        verticalLineTo(10f)
        curveTo(18.6667f, 10.6f, 19f, 13.12f, 22f, 13.6f)
        }
        }.build()

        return _playlist03!!
    }

private var _playlist03: ImageVector? = null
