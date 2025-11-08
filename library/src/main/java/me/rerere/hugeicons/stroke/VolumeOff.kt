package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = ImageVector.Builder(
            name = "VolumeOff",
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
        moveTo(22f, 22f)
        lineTo(2f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10f)
        curveTo(17.6296f, 10.7667f, 18f, 11.7054f, 18f, 12.7195f)
        curveTo(18f, 13.1635f, 17.929f, 13.593f, 17.7963f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 8f)
        curveTo(21.2508f, 9.22951f, 22f, 10.7952f, 22f, 12.5f)
        curveTo(22f, 13.9164f, 21.4829f, 15.2367f, 20.5906f, 16.348f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 14f)
        curveTo(14f, 17.1452f, 14f, 19.5313f, 13.074f, 19.9227f)
        curveTo(12.1481f, 20.3141f, 11.0583f, 19.2021f, 8.8787f, 16.9781f)
        curveTo(7.7499f, 15.8264f, 7.106f, 15.5713f, 5.5f, 15.5713f)
        curveTo(4.3879f, 15.5713f, 3.02749f, 15.7187f, 2.33706f, 14.6643f)
        curveTo(2f, 14.1496f, 2f, 13.4331f, 2f, 12f)
        curveTo(2f, 10.5669f, 2f, 9.85038f, 2.33706f, 9.33566f)
        curveTo(3.02749f, 8.28131f, 4.3879f, 8.42869f, 5.5f, 8.42869f)
        curveTo(6.60725f, 8.42869f, 7.3569f, 8.43869f, 7.96f, 7.96f)
        moveTo(14f, 9.5f)
        curveTo(14f, 6.3548f, 14.026f, 4.46866f, 13.1f, 4.0773f)
        curveTo(12.3292f, 3.75147f, 11.5323f, 4.46765f, 10f, 6f)
        }
        }.build()

        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
