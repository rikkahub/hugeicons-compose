package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = ImageVector.Builder(
            name = "Headphones",
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
        moveTo(20.0849f, 17f)
        curveTo(20.5849f, 15.5f, 21f, 13.4368f, 21f, 12f)
        curveTo(21f, 7.02944f, 16.9706f, 3f, 12f, 3f)
        curveTo(7.02944f, 3f, 3f, 7.02944f, 3f, 12f)
        curveTo(3f, 13.4368f, 3.41512f, 15.5f, 3.91512f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.97651f, 19.6043f)
        lineTo(7.23857f, 14.6127f)
        curveTo(7.05341f, 14.1466f, 6.4617f, 13.9131f, 5.97493f, 14.0297f)
        curveTo(4.46441f, 14.5333f, 3.6462f, 16.1718f, 4.14742f, 17.6895f)
        lineTo(4.58543f, 19.0158f)
        curveTo(5.08664f, 20.5334f, 6.71747f, 21.3555f, 8.22799f, 20.8519f)
        curveTo(8.68896f, 20.6556f, 9.10449f, 20.0897f, 8.97651f, 19.6043f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0235f, 19.6043f)
        lineTo(16.7614f, 14.6127f)
        curveTo(16.9466f, 14.1466f, 17.5383f, 13.9131f, 18.0251f, 14.0297f)
        curveTo(19.5356f, 14.5333f, 20.3538f, 16.1718f, 19.8526f, 17.6895f)
        lineTo(19.4146f, 19.0158f)
        curveTo(18.9134f, 20.5334f, 17.2825f, 21.3555f, 15.772f, 20.8519f)
        curveTo(15.311f, 20.6556f, 14.8955f, 20.0897f, 15.0235f, 19.6043f)
        }
        }.build()

        return _headphones!!
    }

private var _headphones: ImageVector? = null
