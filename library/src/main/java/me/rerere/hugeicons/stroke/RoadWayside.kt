package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RoadWayside: ImageVector
    get() {
        if (_roadWayside != null) {
            return _roadWayside!!
        }
        _roadWayside = ImageVector.Builder(
            name = "RoadWayside",
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
        moveTo(15.5f, 2.5f)
        curveTo(15.5f, 5.32843f, 15.5f, 6.74264f, 16.3787f, 7.62132f)
        curveTo(17.2574f, 8.5f, 18.6716f, 8.5f, 21.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 21.5f)
        curveTo(15.5f, 18.6716f, 15.5f, 17.2574f, 16.3787f, 16.3787f)
        curveTo(17.2574f, 15.5f, 18.6716f, 15.5f, 21.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 2.5f)
        curveTo(8.5f, 5.32843f, 8.5f, 6.74264f, 7.62132f, 7.62132f)
        curveTo(6.74264f, 8.5f, 5.32843f, 8.5f, 2.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 21.5f)
        curveTo(8.5f, 18.6716f, 8.5f, 17.2574f, 7.62132f, 16.3787f)
        curveTo(6.74264f, 15.5f, 5.32843f, 15.5f, 2.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12.0001f)
        curveTo(15f, 13.657f, 13.6569f, 15.0001f, 12f, 15.0001f)
        curveTo(10.3431f, 15.0001f, 9f, 13.657f, 9f, 12.0001f)
        curveTo(9f, 10.3433f, 10.3431f, 9.00012f, 12f, 9.00012f)
        curveTo(13.6569f, 9.00012f, 15f, 10.3433f, 15f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 12f)
        lineTo(19.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19.5f)
        verticalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 12f)
        lineTo(2.5f, 12f)
        }
        }.build()

        return _roadWayside!!
    }

private var _roadWayside: ImageVector? = null
