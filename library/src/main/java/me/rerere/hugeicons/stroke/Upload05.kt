package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Upload05: ImageVector
    get() {
        if (_upload05 != null) {
            return _upload05!!
        }
        _upload05 = ImageVector.Builder(
            name = "Upload05",
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
        moveTo(2.50003f, 13.5f)
        verticalLineTo(6.5f)
        horizontalLineTo(21.5f)
        verticalLineTo(13.5f)
        curveTo(21.5f, 17.2712f, 21.5f, 19.1569f, 20.3285f, 20.3284f)
        curveTo(19.1569f, 21.5f, 17.2713f, 21.5f, 13.5f, 21.5f)
        horizontalLineTo(10.5f)
        curveTo(6.72879f, 21.5f, 4.84318f, 21.5f, 3.6716f, 20.3284f)
        curveTo(2.50003f, 19.1569f, 2.50003f, 17.2712f, 2.50003f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.50003f, 6.5f)
        lineTo(3.10003f, 5.7f)
        curveTo(4.27774f, 4.12972f, 4.86659f, 3.34458f, 5.71118f, 2.92229f)
        curveTo(6.55576f, 2.5f, 7.53718f, 2.5f, 9.50003f, 2.5f)
        horizontalLineTo(14.5f)
        curveTo(16.4629f, 2.5f, 17.4443f, 2.5f, 18.2889f, 2.92229f)
        curveTo(19.1335f, 3.34458f, 19.7223f, 4.12972f, 20.9f, 5.7f)
        lineTo(21.5f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13.5f)
        curveTo(15f, 13.5f, 12.7906f, 10.5f, 12f, 10.5f)
        curveTo(11.2095f, 10.5f, 9.00003f, 13.5f, 9.00003f, 13.5f)
        moveTo(12f, 11f)
        lineTo(12f, 17.5f)
        }
        }.build()

        return _upload05!!
    }

private var _upload05: ImageVector? = null
