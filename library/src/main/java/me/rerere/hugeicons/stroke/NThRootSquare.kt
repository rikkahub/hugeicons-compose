package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NThRootSquare: ImageVector
    get() {
        if (_nThRootSquare != null) {
            return _nThRootSquare!!
        }
        _nThRootSquare = ImageVector.Builder(
            name = "NThRootSquare",
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
        moveTo(7f, 10.519f)
        verticalLineTo(8.55357f)
        moveTo(7f, 8.55357f)
        curveTo(7.06134f, 7.73058f, 7.67624f, 7f, 8.51042f, 7f)
        curveTo(9.49429f, 7f, 9.93903f, 7.93135f, 10.006f, 8.55357f)
        verticalLineTo(10.519f)
        moveTo(7f, 8.55357f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99023f, 14.514f)
        curveTo(7.45398f, 14.2589f, 7.86023f, 14.167f, 8.061f, 14.34f)
        curveTo(8.26177f, 14.513f, 8.68914f, 15.3054f, 8.86408f, 15.6115f)
        curveTo(9.13177f, 16.08f, 9.43963f, 17.0169f, 9.97501f, 17.0169f)
        curveTo(10.3364f, 17.0169f, 10.6267f, 16.0384f, 11.0993f, 14.8754f)
        curveTo(11.8192f, 13.1038f, 12.6244f, 10.8612f, 12.7456f, 10.6592f)
        curveTo(12.9464f, 10.3246f, 13.1472f, 9.98999f, 13.6825f, 9.98999f)
        curveTo(14.2849f, 9.98999f, 17.0287f, 9.98999f, 17.0287f, 9.98999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _nThRootSquare!!
    }

private var _nThRootSquare: ImageVector? = null
