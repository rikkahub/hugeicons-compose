package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BaseballBat: ImageVector
    get() {
        if (_baseballBat != null) {
            return _baseballBat!!
        }
        _baseballBat = ImageVector.Builder(
            name = "BaseballBat",
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
        moveTo(5.45946f, 20f)
        lineTo(20.5567f, 8.68934f)
        curveTo(22.3317f, 7.30882f, 22.495f, 4.68503f, 20.905f, 3.09501f)
        curveTo(19.315f, 1.50499f, 16.6912f, 1.66834f, 15.3107f, 3.4433f)
        lineTo(4f, 18.5405f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.57835f, 21.8426f)
        curveTo(7.08033f, 19.7713f, 4.24567f, 16.9109f, 2.15723f, 18.4251f)
        curveTo(1.96763f, 18.5625f, 1.94595f, 18.8368f, 2.11159f, 19.0023f)
        lineTo(5.00015f, 21.8884f)
        curveTo(5.16597f, 22.0541f, 5.44077f, 22.0323f, 5.57835f, 21.8426f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 17f)
        lineTo(7f, 14f)
        }
        }.build()

        return _baseballBat!!
    }

private var _baseballBat: ImageVector? = null
