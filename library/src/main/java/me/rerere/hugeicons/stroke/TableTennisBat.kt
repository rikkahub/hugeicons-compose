package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TableTennisBat: ImageVector
    get() {
        if (_tableTennisBat != null) {
            return _tableTennisBat!!
        }
        _tableTennisBat = ImageVector.Builder(
            name = "TableTennisBat",
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
        moveTo(6f, 8f)
        lineTo(16f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.48802f, 18.1868f)
        curveTo(4.27193f, 17.0655f, 6.999f, 15.3875f, 7.40038f, 13.6847f)
        curveTo(7.52522f, 13.1551f, 7.24468f, 12.6415f, 7.00243f, 12.1542f)
        curveTo(5.83072f, 9.79703f, 5.80432f, 7.05244f, 7.54627f, 5.31272f)
        curveTo(10.584f, 2.27886f, 17.1053f, 0.495103f, 20.307f, 3.69226f)
        curveTo(23.505f, 6.88574f, 21.7222f, 13.4012f, 18.6842f, 16.4348f)
        curveTo(16.942f, 18.1746f, 14.1945f, 18.149f, 11.8339f, 16.9787f)
        curveTo(11.3457f, 16.7368f, 10.8314f, 16.4565f, 10.3009f, 16.5812f)
        curveTo(8.59557f, 16.982f, 6.91469f, 19.7046f, 5.79184f, 21.4859f)
        curveTo(4.57177f, 23.4214f, 0.634453f, 19.3518f, 2.48802f, 18.1868f)
        }
        }.build()

        return _tableTennisBat!!
    }

private var _tableTennisBat: ImageVector? = null
