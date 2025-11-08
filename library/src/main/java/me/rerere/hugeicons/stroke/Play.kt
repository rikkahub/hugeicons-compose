package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = ImageVector.Builder(
            name = "Play",
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
        moveTo(18.8906f, 12.846f)
        curveTo(18.5371f, 14.189f, 16.8667f, 15.138f, 13.5257f, 17.0361f)
        curveTo(10.296f, 18.8709f, 8.6812f, 19.7884f, 7.37983f, 19.4196f)
        curveTo(6.8418f, 19.2671f, 6.35159f, 18.9776f, 5.95624f, 18.5787f)
        curveTo(5f, 17.6139f, 5f, 15.7426f, 5f, 12f)
        curveTo(5f, 8.2574f, 5f, 6.3861f, 5.95624f, 5.42132f)
        curveTo(6.35159f, 5.02245f, 6.8418f, 4.73288f, 7.37983f, 4.58042f)
        curveTo(8.6812f, 4.21165f, 10.296f, 5.12907f, 13.5257f, 6.96393f)
        curveTo(16.8667f, 8.86197f, 18.5371f, 9.811f, 18.8906f, 11.154f)
        curveTo(19.0365f, 11.7084f, 19.0365f, 12.2916f, 18.8906f, 12.846f)
        }
        }.build()

        return _play!!
    }

private var _play: ImageVector? = null
