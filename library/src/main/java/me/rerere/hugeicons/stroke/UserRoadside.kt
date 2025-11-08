package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserRoadside: ImageVector
    get() {
        if (_userRoadside != null) {
            return _userRoadside!!
        }
        _userRoadside = ImageVector.Builder(
            name = "UserRoadside",
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
        moveTo(12.9981f, 6.5f)
        horizontalLineTo(11.0019f)
        curveTo(8.13196f, 6.5f, 6.19701f, 9.56909f, 7.32753f, 12.328f)
        curveTo(7.48501f, 12.7124f, 7.84633f, 12.9615f, 8.24612f, 12.9615f)
        horizontalLineTo(8.9491f)
        curveTo(9.18605f, 12.9615f, 9.39259f, 13.1302f, 9.45006f, 13.3706f)
        lineTo(10.3551f, 17.1567f)
        curveTo(10.5438f, 17.9462f, 11.222f, 18.5f, 12f, 18.5f)
        curveTo(12.778f, 18.5f, 13.4562f, 17.9462f, 13.6449f, 17.1567f)
        lineTo(14.5499f, 13.3706f)
        curveTo(14.6074f, 13.1302f, 14.814f, 12.9615f, 15.0509f, 12.9615f)
        horizontalLineTo(15.7539f)
        curveTo(16.1537f, 12.9615f, 16.515f, 12.7124f, 16.6725f, 12.328f)
        curveTo(17.803f, 9.56909f, 15.868f, 6.5f, 12.9981f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 4f)
        curveTo(14.5f, 5.38071f, 13.3807f, 6.5f, 12f, 6.5f)
        curveTo(10.6193f, 6.5f, 9.5f, 5.38071f, 9.5f, 4f)
        curveTo(9.5f, 2.61929f, 10.6193f, 1.5f, 12f, 1.5f)
        curveTo(13.3807f, 1.5f, 14.5f, 2.61929f, 14.5f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 16.5f)
        lineTo(6f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.5f)
        lineTo(12f, 22.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16.5f)
        lineTo(17f, 16.5f)
        }
        }.build()

        return _userRoadside!!
    }

private var _userRoadside: ImageVector? = null
