package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Analytics02: ImageVector
    get() {
        if (_analytics02 != null) {
            return _analytics02!!
        }
        _analytics02 = ImageVector.Builder(
            name = "Analytics02",
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
        moveTo(6.5f, 17.5f)
        lineTo(6.5f, 14.5f)
        moveTo(11.5f, 17.5f)
        lineTo(11.5f, 8.5f)
        moveTo(16.5f, 17.5f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 5.5f)
        curveTo(21.5f, 7.15685f, 20.1569f, 8.5f, 18.5f, 8.5f)
        curveTo(16.8431f, 8.5f, 15.5f, 7.15685f, 15.5f, 5.5f)
        curveTo(15.5f, 3.84315f, 16.8431f, 2.5f, 18.5f, 2.5f)
        curveTo(20.1569f, 2.5f, 21.5f, 3.84315f, 21.5f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.4955f, 11f)
        curveTo(21.4955f, 11f, 21.5f, 11.3395f, 21.5f, 12f)
        curveTo(21.5f, 16.4784f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4784f, 2.5f, 12f)
        curveTo(2.5f, 7.52169f, 2.5f, 5.28252f, 3.89124f, 3.89127f)
        curveTo(5.28249f, 2.50003f, 7.52166f, 2.50003f, 12f, 2.50003f)
        lineTo(13f, 2.5f)
        }
        }.build()

        return _analytics02!!
    }

private var _analytics02: ImageVector? = null
