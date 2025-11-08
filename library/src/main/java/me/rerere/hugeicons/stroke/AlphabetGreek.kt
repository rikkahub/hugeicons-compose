package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetGreek: ImageVector
    get() {
        if (_alphabetGreek != null) {
            return _alphabetGreek!!
        }
        _alphabetGreek = ImageVector.Builder(
            name = "AlphabetGreek",
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
        moveTo(2f, 19f)
        curveTo(2.02342f, 19.7767f, 2.11012f, 20.24f, 2.43105f, 20.5607f)
        curveTo(2.87077f, 21f, 3.57849f, 21f, 4.99393f, 21f)
        horizontalLineTo(7.965f)
        curveTo(8.74255f, 21f, 9.13132f, 21f, 9.17551f, 20.8603f)
        curveTo(9.2197f, 20.7206f, 8.88712f, 20.4868f, 8.22198f, 20.0192f)
        curveTo(5.86888f, 18.3648f, 3.99306f, 15.5091f, 3.99306f, 12.2636f)
        curveTo(3.99306f, 7.14744f, 7.57789f, 3f, 12f, 3f)
        curveTo(16.4221f, 3f, 20.0069f, 7.14744f, 20.0069f, 12.2636f)
        curveTo(20.0069f, 15.5091f, 18.1311f, 18.3648f, 15.778f, 20.0192f)
        curveTo(15.1129f, 20.4868f, 14.7803f, 20.7206f, 14.8245f, 20.8603f)
        curveTo(14.8687f, 21f, 15.2574f, 21f, 16.035f, 21f)
        horizontalLineTo(19.0061f)
        curveTo(20.4215f, 21f, 21.1292f, 21f, 21.5689f, 20.5607f)
        curveTo(21.8899f, 20.24f, 21.9766f, 19.7767f, 22f, 19f)
        }
        }.build()

        return _alphabetGreek!!
    }

private var _alphabetGreek: ImageVector? = null
