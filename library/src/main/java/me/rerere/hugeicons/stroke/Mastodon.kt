package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mastodon: ImageVector
    get() {
        if (_mastodon != null) {
            return _mastodon!!
        }
        _mastodon = ImageVector.Builder(
            name = "Mastodon",
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
        moveTo(17f, 13.5f)
        verticalLineTo(8f)
        curveTo(17f, 6.61929f, 15.8807f, 5.5f, 14.5f, 5.5f)
        curveTo(13.1193f, 5.5f, 12f, 6.61929f, 12f, 8f)
        moveTo(12f, 8f)
        verticalLineTo(11.5f)
        moveTo(12f, 8f)
        curveTo(12f, 6.61929f, 10.8807f, 5.5f, 9.5f, 5.5f)
        curveTo(8.11929f, 5.5f, 7f, 6.61929f, 7f, 8f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16.9954f)
        curveTo(15.0099f, 16.9954f, 16.89f, 16.6876f, 18.4949f, 16.1525f)
        curveTo(20.1275f, 15.6081f, 21f, 13.9512f, 21f, 12.2302f)
        verticalLineTo(7.52349f)
        curveTo(21f, 5.34784f, 19.8297f, 3.2779f, 17.7281f, 2.715f)
        curveTo(16.0259f, 2.25905f, 14.0744f, 2f, 12f, 2f)
        curveTo(9.9256f, 2f, 7.97414f, 2.25905f, 6.27189f, 2.715f)
        curveTo(4.17033f, 3.2779f, 3f, 5.34785f, 3f, 7.52349f)
        verticalLineTo(14.4961f)
        curveTo(3f, 22.4937f, 11f, 21.9938f, 11f, 21.9938f)
        curveTo(13.5f, 21.9938f, 15f, 21f, 15f, 21f)
        verticalLineTo(20f)
        curveTo(15f, 20f, 13.5f, 20.4943f, 11f, 20.4943f)
        curveTo(5.68009f, 20.4943f, 7.06011f, 15.9957f, 7.06011f, 15.9957f)
        curveTo(8.75781f, 16.627f, 10.8012f, 16.9954f, 13f, 16.9954f)
        }
        }.build()

        return _mastodon!!
    }

private var _mastodon: ImageVector? = null
