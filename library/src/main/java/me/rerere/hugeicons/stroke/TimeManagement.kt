package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeManagement: ImageVector
    get() {
        if (_timeManagement != null) {
            return _timeManagement!!
        }
        _timeManagement = ImageVector.Builder(
            name = "TimeManagement",
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
        moveTo(2f, 19.5f)
        curveTo(2f, 18.3215f, 2f, 17.7322f, 2.43934f, 17.3661f)
        curveTo(2.87868f, 17f, 3.58579f, 17f, 5f, 17f)
        curveTo(6.41421f, 17f, 7.12132f, 17f, 7.56066f, 17.3661f)
        curveTo(8f, 17.7322f, 8f, 18.3215f, 8f, 19.5f)
        curveTo(8f, 20.6785f, 8f, 21.2678f, 7.56066f, 21.6339f)
        curveTo(7.12132f, 22f, 6.41421f, 22f, 5f, 22f)
        curveTo(3.58579f, 22f, 2.87868f, 22f, 2.43934f, 21.6339f)
        curveTo(2f, 21.2678f, 2f, 20.6785f, 2f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 19.5f)
        curveTo(16f, 18.3215f, 16f, 17.7322f, 16.4393f, 17.3661f)
        curveTo(16.8787f, 17f, 17.5858f, 17f, 19f, 17f)
        curveTo(20.4142f, 17f, 21.1213f, 17f, 21.5607f, 17.3661f)
        curveTo(22f, 17.7322f, 22f, 18.3215f, 22f, 19.5f)
        curveTo(22f, 20.6785f, 22f, 21.2678f, 21.5607f, 21.6339f)
        curveTo(21.1213f, 22f, 20.4142f, 22f, 19f, 22f)
        curveTo(17.5858f, 22f, 16.8787f, 22f, 16.4393f, 21.6339f)
        curveTo(16f, 21.2678f, 16f, 20.6785f, 16f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 17f)
        curveTo(19f, 14.518f, 18.2562f, 14f, 14.6923f, 14f)
        horizontalLineTo(9.30769f)
        curveTo(5.74379f, 14f, 5f, 14.518f, 5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6.5f)
        lineTo(13f, 5f)
        moveTo(16.5f, 6.5f)
        curveTo(16.5f, 8.98528f, 14.4853f, 11f, 12f, 11f)
        curveTo(9.51472f, 11f, 7.5f, 8.98528f, 7.5f, 6.5f)
        curveTo(7.5f, 4.01472f, 9.51472f, 2f, 12f, 2f)
        curveTo(14.4853f, 2f, 16.5f, 4.01472f, 16.5f, 6.5f)
        }
        }.build()

        return _timeManagement!!
    }

private var _timeManagement: ImageVector? = null
