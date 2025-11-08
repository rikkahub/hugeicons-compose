package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SlowWinds: ImageVector
    get() {
        if (_slowWinds != null) {
            return _slowWinds!!
        }
        _slowWinds = ImageVector.Builder(
            name = "SlowWinds",
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
        moveTo(21f, 5.63247f)
        curveTo(19.8635f, 4.81397f, 18.4095f, 4.81397f, 17.273f, 5.63247f)
        curveTo(16.5877f, 6.13474f, 15.6685f, 6.11614f, 14.9833f, 5.61388f)
        curveTo(13.8468f, 4.79537f, 12.3928f, 4.79537f, 11.273f, 5.61388f)
        curveTo(10.571f, 6.11614f, 9.68524f, 6.11614f, 9f, 5.61388f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9.37672f)
        curveTo(4.16839f, 10.1953f, 5.66323f, 10.1953f, 6.83162f, 9.37672f)
        curveTo(7.53608f, 8.87443f, 8.46392f, 8.87443f, 9.16838f, 9.37672f)
        curveTo(10.3368f, 10.1953f, 11.8488f, 10.2139f, 13f, 9.39531f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 14.6233f)
        curveTo(19.8635f, 13.8047f, 18.4095f, 13.8047f, 17.273f, 14.6233f)
        curveTo(16.5877f, 15.1256f, 15.6852f, 15.1256f, 15f, 14.6233f)
        curveTo(13.8635f, 13.8047f, 12.3928f, 13.7861f, 11.273f, 14.6047f)
        curveTo(10.571f, 15.107f, 9.68524f, 15.107f, 9f, 14.6047f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 18.3767f)
        curveTo(4.16839f, 19.1953f, 5.66323f, 19.1953f, 6.83162f, 18.3767f)
        curveTo(7.53608f, 17.8744f, 8.46392f, 17.8744f, 9.16838f, 18.3767f)
        curveTo(10.3368f, 19.1953f, 11.8488f, 19.2139f, 13f, 18.3953f)
        }
        }.build()

        return _slowWinds!!
    }

private var _slowWinds: ImageVector? = null
