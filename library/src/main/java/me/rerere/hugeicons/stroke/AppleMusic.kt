package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AppleMusic: ImageVector
    get() {
        if (_appleMusic != null) {
            return _appleMusic!!
        }
        _appleMusic = ImageVector.Builder(
            name = "AppleMusic",
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
        moveTo(4.25276f, 20.302f)
        curveTo(5.6554f, 21.5f, 7.77027f, 21.5f, 12f, 21.5f)
        curveTo(16.2297f, 21.5f, 18.3446f, 21.5f, 19.7472f, 20.302f)
        curveTo(19.9464f, 20.1319f, 20.1319f, 19.9464f, 20.302f, 19.7472f)
        curveTo(21.5f, 18.3446f, 21.5f, 16.2297f, 21.5f, 12f)
        curveTo(21.5f, 7.77027f, 21.5f, 5.6554f, 20.302f, 4.25276f)
        curveTo(20.1319f, 4.05358f, 19.9464f, 3.86808f, 19.7472f, 3.69797f)
        curveTo(18.3446f, 2.5f, 16.2297f, 2.5f, 12f, 2.5f)
        curveTo(7.77027f, 2.5f, 5.6554f, 2.5f, 4.25276f, 3.69797f)
        curveTo(4.05358f, 3.86808f, 3.86808f, 4.05358f, 3.69797f, 4.25276f)
        curveTo(2.5f, 5.6554f, 2.5f, 7.77027f, 2.5f, 12f)
        curveTo(2.5f, 16.2297f, 2.5f, 18.3446f, 3.69797f, 19.7472f)
        curveTo(3.86808f, 19.9464f, 4.05358f, 20.1319f, 4.25276f, 20.302f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.05181f, 16.0523f)
        lineTo(7.44711f, 16.6596f)
        curveTo(7.17802f, 16.7615f, 7f, 17.0193f, 7f, 17.3071f)
        curveTo(7f, 17.7968f, 7.49439f, 18.1317f, 7.94888f, 17.9498f)
        lineTo(8.87139f, 17.5806f)
        curveTo(9.25105f, 17.4287f, 9.5f, 17.0608f, 9.5f, 16.6517f)
        verticalLineTo(9.5f)
        moveTo(15.5518f, 14.5517f)
        lineTo(13.9471f, 15.159f)
        curveTo(13.678f, 15.2608f, 13.5f, 15.5186f, 13.5f, 15.8064f)
        curveTo(13.5f, 16.2961f, 13.9944f, 16.631f, 14.4489f, 16.4491f)
        lineTo(15.3714f, 16.08f)
        curveTo(15.751f, 15.928f, 16f, 15.5602f, 16f, 15.1511f)
        verticalLineTo(8.20125f)
        moveTo(9.5f, 9.5f)
        lineTo(16f, 8.20125f)
        moveTo(9.5f, 9.5f)
        verticalLineTo(8.65872f)
        moveTo(16f, 8.20125f)
        verticalLineTo(7.35063f)
        moveTo(16f, 7.35063f)
        verticalLineTo(6.5f)
        lineTo(9.5f, 7.81743f)
        verticalLineTo(8.65872f)
        moveTo(16f, 7.35063f)
        lineTo(9.5f, 8.65872f)
        }
        }.build()

        return _appleMusic!!
    }

private var _appleMusic: ImageVector? = null
