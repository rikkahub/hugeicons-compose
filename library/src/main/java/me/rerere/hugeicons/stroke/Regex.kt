package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Regex: ImageVector
    get() {
        if (_regex != null) {
            return _regex!!
        }
        _regex = ImageVector.Builder(
            name = "Regex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.6626f, 3f)
            verticalLineTo(13f)
            moveTo(20.9952f, 5.49567f)
            lineTo(12.335f, 10.4957f)
            moveTo(21.0002f, 10.4961f)
            lineTo(12.34f, 5.49609f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.80959f, 15.3837f)
            curveTo(10f, 15.8221f, 10f, 16.3814f, 10f, 17.5f)
            curveTo(10f, 18.6186f, 10f, 19.1779f, 9.80959f, 19.6163f)
            curveTo(9.57739f, 20.1509f, 9.1509f, 20.5774f, 8.61632f, 20.8096f)
            curveTo(8.17795f, 21f, 7.61863f, 21f, 6.5f, 21f)
            curveTo(5.38137f, 21f, 4.82205f, 21f, 4.38368f, 20.8096f)
            curveTo(3.8491f, 20.5774f, 3.42261f, 20.1509f, 3.19041f, 19.6163f)
            curveTo(3f, 19.1779f, 3f, 18.6186f, 3f, 17.5f)
            curveTo(3f, 16.3814f, 3f, 15.8221f, 3.19041f, 15.3837f)
            curveTo(3.42261f, 14.8491f, 3.8491f, 14.4226f, 4.38368f, 14.1904f)
            curveTo(4.82205f, 14f, 5.38137f, 14f, 6.5f, 14f)
            curveTo(7.61863f, 14f, 8.17795f, 14f, 8.61632f, 14.1904f)
            curveTo(9.1509f, 14.4226f, 9.57739f, 14.8491f, 9.80959f, 15.3837f)
            close()
        }
        }.build()

        return _regex!!
    }

private var _regex: ImageVector? = null
